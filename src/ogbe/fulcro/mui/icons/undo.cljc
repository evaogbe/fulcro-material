(ns ogbe.fulcro.mui.icons.undo
  #?(:cljs (:require
            ["@mui/icons-material/Undo" :default Undo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-undo
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Undo)))