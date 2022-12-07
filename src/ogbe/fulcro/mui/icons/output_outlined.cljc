(ns ogbe.fulcro.mui.icons.output-outlined
  #?(:cljs (:require
            ["@mui/icons-material/OutputOutlined" :default OutputOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-output-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutputOutlined)))