(ns ogbe.fulcro.mui.icons.museum-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MuseumOutlined" :default MuseumOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-museum-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MuseumOutlined)))