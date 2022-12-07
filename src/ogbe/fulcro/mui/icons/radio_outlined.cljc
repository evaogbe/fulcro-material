(ns ogbe.fulcro.mui.icons.radio-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RadioOutlined" :default RadioOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radio-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RadioOutlined)))