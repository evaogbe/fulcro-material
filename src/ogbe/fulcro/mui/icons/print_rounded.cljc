(ns ogbe.fulcro.mui.icons.print-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PrintRounded" :default PrintRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-print-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PrintRounded)))