(ns ogbe.fulcro.mui.icons.park
  #?(:cljs (:require
            ["@mui/icons-material/Park" :default Park]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-park
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Park)))