(ns ogbe.fulcro.mui.icons.arrow-back-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ArrowBackOutlined" :default ArrowBackOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-back-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowBackOutlined)))