(ns ogbe.fulcro.mui.icons.redo
  #?(:cljs (:require
            ["@mui/icons-material/Redo" :default Redo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-redo
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Redo)))