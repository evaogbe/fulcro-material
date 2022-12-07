(ns ogbe.fulcro.mui.icons.copyright-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CopyrightRounded" :default CopyrightRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-copyright-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CopyrightRounded)))