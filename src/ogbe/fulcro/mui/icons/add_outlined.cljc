(ns ogbe.fulcro.mui.icons.add-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AddOutlined" :default AddOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddOutlined)))