(ns ogbe.fulcro.mui.icons.input-outlined
  #?(:cljs (:require
            ["@mui/icons-material/InputOutlined" :default InputOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-input-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InputOutlined)))