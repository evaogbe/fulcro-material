(ns ogbe.fulcro.mui.icons.create-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CreateOutlined" :default CreateOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-create-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CreateOutlined)))