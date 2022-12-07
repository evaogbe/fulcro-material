(ns ogbe.fulcro.mui.icons.build-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BuildOutlined" :default BuildOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-build-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BuildOutlined)))