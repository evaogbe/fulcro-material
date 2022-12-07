(ns ogbe.fulcro.mui.icons.help-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HelpOutlined" :default HelpOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-help-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HelpOutlined)))