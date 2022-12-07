(ns ogbe.fulcro.mui.icons.open-in-new
  #?(:cljs (:require
            ["@mui/icons-material/OpenInNew" :default OpenInNew]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-in-new
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenInNew)))