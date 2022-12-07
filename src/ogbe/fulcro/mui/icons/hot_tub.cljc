(ns ogbe.fulcro.mui.icons.hot-tub
  #?(:cljs (:require
            ["@mui/icons-material/HotTub" :default HotTub]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hot-tub
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HotTub)))