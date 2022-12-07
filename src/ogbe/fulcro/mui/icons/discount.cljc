(ns ogbe.fulcro.mui.icons.discount
  #?(:cljs (:require
            ["@mui/icons-material/Discount" :default Discount]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-discount
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Discount)))