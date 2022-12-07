(ns ogbe.fulcro.mui.icons.logo-dev-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LogoDevSharp" :default LogoDevSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-logo-dev-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LogoDevSharp)))