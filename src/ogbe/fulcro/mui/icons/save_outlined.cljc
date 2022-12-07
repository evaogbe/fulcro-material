(ns ogbe.fulcro.mui.icons.save-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SaveOutlined" :default SaveOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveOutlined)))