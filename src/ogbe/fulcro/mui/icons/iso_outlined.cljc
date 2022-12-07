(ns ogbe.fulcro.mui.icons.iso-outlined
  #?(:cljs (:require
            ["@mui/icons-material/IsoOutlined" :default IsoOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-iso-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IsoOutlined)))