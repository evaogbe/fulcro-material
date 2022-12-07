(ns ogbe.fulcro.mui.icons.print-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PrintSharp" :default PrintSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-print-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PrintSharp)))