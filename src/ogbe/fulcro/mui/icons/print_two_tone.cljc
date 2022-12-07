(ns ogbe.fulcro.mui.icons.print-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PrintTwoTone" :default PrintTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-print-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PrintTwoTone)))