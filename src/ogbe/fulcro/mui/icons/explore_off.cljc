(ns ogbe.fulcro.mui.icons.explore-off
  #?(:cljs (:require
            ["@mui/icons-material/ExploreOff" :default ExploreOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-explore-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExploreOff)))