(ns ogbe.fulcro.mui.icons.woman-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WomanOutlined" :default WomanOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-woman-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WomanOutlined)))