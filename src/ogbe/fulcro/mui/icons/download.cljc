(ns ogbe.fulcro.mui.icons.download
  #?(:cljs (:require
            ["@mui/icons-material/Download" :default Download]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-download
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Download)))