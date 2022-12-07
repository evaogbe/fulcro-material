(ns ogbe.fulcro.mui.icons.swipe
  #?(:cljs (:require
            ["@mui/icons-material/Swipe" :default Swipe]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-swipe
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Swipe)))