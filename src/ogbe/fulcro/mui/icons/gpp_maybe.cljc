(ns ogbe.fulcro.mui.icons.gpp-maybe
  #?(:cljs (:require
            ["@mui/icons-material/GppMaybe" :default GppMaybe]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gpp-maybe
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GppMaybe)))