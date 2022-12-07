(ns ogbe.fulcro.mui.icons.tapas-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TapasOutlined" :default TapasOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tapas-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TapasOutlined)))