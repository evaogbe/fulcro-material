(ns ogbe.fulcro.mui.icons.arrow-left-outlined
  #?(:cljs (:require
            ["@mui/icons-material/ArrowLeftOutlined" :default ArrowLeftOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-left-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowLeftOutlined)))