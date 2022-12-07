(ns ogbe.fulcro.mui.icons.title-rounded
  #?(:cljs (:require
            ["@mui/icons-material/TitleRounded" :default TitleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-title-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TitleRounded)))