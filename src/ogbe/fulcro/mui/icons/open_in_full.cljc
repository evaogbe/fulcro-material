(ns ogbe.fulcro.mui.icons.open-in-full
  #?(:cljs (:require
            ["@mui/icons-material/OpenInFull" :default OpenInFull]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-in-full
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenInFull)))