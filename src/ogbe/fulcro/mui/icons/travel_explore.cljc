(ns ogbe.fulcro.mui.icons.travel-explore
  #?(:cljs (:require
            ["@mui/icons-material/TravelExplore" :default TravelExplore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-travel-explore
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TravelExplore)))