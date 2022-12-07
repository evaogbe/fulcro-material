(ns ogbe.fulcro.mui.icons.logo-dev
  #?(:cljs (:require
            ["@mui/icons-material/LogoDev" :default LogoDev]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-logo-dev
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LogoDev)))