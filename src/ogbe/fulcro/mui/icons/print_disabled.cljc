(ns ogbe.fulcro.mui.icons.print-disabled
  #?(:cljs (:require
            ["@mui/icons-material/PrintDisabled" :default PrintDisabled]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-print-disabled
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PrintDisabled)))