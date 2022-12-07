(ns ogbe.fulcro.mui.icons.you-tube
  #?(:cljs (:require
            ["@mui/icons-material/YouTube" :default YouTube]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-you-tube
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory YouTube)))