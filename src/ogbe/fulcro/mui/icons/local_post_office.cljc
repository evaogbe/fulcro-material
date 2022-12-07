(ns ogbe.fulcro.mui.icons.local-post-office
  #?(:cljs (:require
            ["@mui/icons-material/LocalPostOffice" :default LocalPostOffice]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-post-office
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalPostOffice)))