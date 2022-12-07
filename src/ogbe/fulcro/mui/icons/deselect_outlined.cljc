(ns ogbe.fulcro.mui.icons.deselect-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DeselectOutlined" :default DeselectOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deselect-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeselectOutlined)))