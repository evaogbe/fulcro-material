(ns ogbe.fulcro.mui.icons.spoke-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SpokeOutlined" :default SpokeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spoke-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpokeOutlined)))