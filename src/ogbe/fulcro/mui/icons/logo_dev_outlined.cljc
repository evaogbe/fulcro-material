(ns ogbe.fulcro.mui.icons.logo-dev-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LogoDevOutlined" :default LogoDevOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-logo-dev-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LogoDevOutlined)))