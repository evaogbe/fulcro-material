(ns ogbe.fulcro.mui.icons.logo-dev-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LogoDevRounded" :default LogoDevRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-logo-dev-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LogoDevRounded)))