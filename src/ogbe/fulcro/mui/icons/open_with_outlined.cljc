(ns ogbe.fulcro.mui.icons.open-with-outlined
  #?(:cljs (:require
            ["@mui/icons-material/OpenWithOutlined" :default OpenWithOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-with-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenWithOutlined)))