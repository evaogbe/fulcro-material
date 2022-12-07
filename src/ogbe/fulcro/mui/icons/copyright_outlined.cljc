(ns ogbe.fulcro.mui.icons.copyright-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CopyrightOutlined" :default CopyrightOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-copyright-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CopyrightOutlined)))