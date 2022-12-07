(ns ogbe.fulcro.mui.icons.newspaper-outlined
  #?(:cljs (:require
            ["@mui/icons-material/NewspaperOutlined" :default NewspaperOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-newspaper-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NewspaperOutlined)))