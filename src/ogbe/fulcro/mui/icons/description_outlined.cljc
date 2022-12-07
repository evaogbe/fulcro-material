(ns ogbe.fulcro.mui.icons.description-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DescriptionOutlined" :default DescriptionOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-description-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DescriptionOutlined)))