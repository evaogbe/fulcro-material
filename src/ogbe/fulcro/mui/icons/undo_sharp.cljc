(ns ogbe.fulcro.mui.icons.undo-sharp
  #?(:cljs (:require
            ["@mui/icons-material/UndoSharp" :default UndoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-undo-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UndoSharp)))