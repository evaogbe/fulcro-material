(ns ogbe.fulcro.mui.icons.info-outlined
  #?(:cljs (:require
            ["@mui/icons-material/InfoOutlined" :default InfoOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-info-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InfoOutlined)))