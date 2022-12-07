(ns ogbe.fulcro.mui.icons.pinch
  #?(:cljs (:require
            ["@mui/icons-material/Pinch" :default Pinch]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pinch
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Pinch)))