(ns ogbe.fulcro.mui.icons.save-as-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SaveAsOutlined" :default SaveAsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-as-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveAsOutlined)))