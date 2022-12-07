(ns ogbe.fulcro.mui.icons.first-page-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FirstPageRounded" :default FirstPageRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-first-page-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FirstPageRounded)))