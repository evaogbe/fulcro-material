(ns ogbe.fulcro.mui.icons.check-box-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CheckBoxOutlined" :default CheckBoxOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-box-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckBoxOutlined)))