(ns ogbe.fulcro.mui.icons.local-printshop
  #?(:cljs (:require
            ["@mui/icons-material/LocalPrintshop" :default LocalPrintshop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-printshop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalPrintshop)))