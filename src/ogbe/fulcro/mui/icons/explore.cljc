(ns ogbe.fulcro.mui.icons.explore
  #?(:cljs (:require
            ["@mui/icons-material/Explore" :default Explore]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-explore
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Explore)))