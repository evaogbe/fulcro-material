(ns ogbe.fulcro.mui.icons.undo-outlined
  #?(:cljs (:require
            ["@mui/icons-material/UndoOutlined" :default UndoOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-undo-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory UndoOutlined)))