(ns ogbe.fulcro.mui.icons.print-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PrintOutlined" :default PrintOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-print-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PrintOutlined)))