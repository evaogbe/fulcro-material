(ns ogbe.fulcro.mui.icons.insert-page-break
  #?(:cljs (:require
            ["@mui/icons-material/InsertPageBreak" :default InsertPageBreak]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-insert-page-break
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InsertPageBreak)))